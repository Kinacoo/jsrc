import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class GetConnection{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
				Connection=
			DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:ip",	"scott","tiger");
			System.out.println("�ڑ�����");

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

