import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class GetConnectionStop{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
				Connection=
			DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:ip",	"scott","tiger");
			System.out.println("�ڑ�����");
			
			//�O���i���s���j����̓��͂�҂��āA�����X�g�b�v
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("�������ܐڑ���");
				String b = a.readLine();
				System.out.printf("���� = %s%n���� = %d����%n", b, b.length());
			} catch(IOException b) {
				System.out.println("���̓G���[");
			}

			//Oracle����ؒf����
			cn.close();
			System.out.println("�ؒf����");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
