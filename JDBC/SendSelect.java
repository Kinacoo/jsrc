import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.math.BigDecimal;


class SendSelect{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"gogo","nono");
			System.out.println("�ڑ�����");
			
			//select��
			String sql=" SELECT SNO, HNAME, PRICE FROM SYOHIN";

			//Statement�C���^�[�t�F�C�X����������N���X���C���X�^���X������
			Statement st=cn.createStatement();

			//select�������s��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			ResultSet rs=st.executeQuery(sql);

			//�J�[�\������s�����X�N���[�����A�f�[�^���t�F�b�`����
			rs.next();
			String sno=rs.getString (1);	//1��ڂ̃f�[�^���擾
			String hname=rs.getString(2);	//2��ڂ̃f�[�^���擾
			BigDecimal price=rs.getBigDecimal(3);	//3��ڂ̃f�[�^���擾
			
			System.out.println("SNO"+"\t"+"HNAME"+"\t"+"PRICE");
			System.out.println(sno+"\t"+hname+"\t"+price);
			

			
			//Oracle����ؒf����
			cn.close();

			System.out.println("�ؒf����");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("�N���X���Ȃ��݂����B");
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("SQL�֘A�̗�O�݂����B");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

