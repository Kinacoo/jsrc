
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.math.BigDecimal;

class CursorScroll {
	public static void main(String[] args){
		//���[�J���ϐ��Ő錾���Ă�������
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//Driver�C���^�[�t�F�C�X����������N���X�����[�h����
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Connection�C���^�[�t�F�C�X����������N���X��
			//�C���X�^���X��Ԃ�
			cn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:ip",
					"gogo", "password");
 

			//�����R�~�b�g��OFF�ɂ���
			cn.setAutoCommit(false);

			//select��
			String sql = "SELECT SNO, HNAME, PRICE FROM SYOHIN";

			//Statement�C���^�[�t�F�C�X����������N���X��
			//�C���X�^���X���擾����
			st = cn.createStatement();

			//select���𑗐M��
			//ResultSet�C���^�[�t�F�C�X�����������N���X��
			//�C���X�^���X���Ԃ�
			rs = st.executeQuery(sql);

			//�J�[�\����1�s���X�N���[�����A�f�[�^���t�F�b�`����
			while (rs.next()) {
				//�f�[�^���擾����
				String a = rs.getString(1);
				String b = rs.getString(2);
				BigDecimal c = rs.getBigDecimal(3);

				//��ʂɏo�͂���
				System.out.println(a + "\t" + b + "\t" + c);
			}

		//Class.forName()�ŗ�O�����̏ꍇ
		} catch(ClassNotFoundException e) {
			e.printStackTrace();

		//getConnection,createStatement,executeQuery�ŗ�O�����̏ꍇ
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//���\�[�X�̉���������s��
			try {
				if(rs != null){
					rs.close();
				}
				if(st != null){
					st.close();
				}
				if(cn!=null){
					cn.close();
				}
			} catch(SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
