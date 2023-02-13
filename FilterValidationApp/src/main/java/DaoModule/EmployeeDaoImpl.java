package DaoModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DtoModule.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
    private static final String sqlInsertQuery="Insert into employee1(eid,ename,eage,email,mobile) values(?,?,?,?,?)";
	@Override
	public String insert(Employee employee) {
		String status=null;
		Connection connection=null;
		PreparedStatement pstmt=null;
		
		try {
			status ="a";
			
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			status="b";
			connection=DriverManager.getConnection("jdbc:mysql:///practise1","root","yashr8143");
			status="c";
			System.out.println(connection);
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);
			if (pstmt != null) {
				pstmt.setString(1, employee.getEid());
				pstmt.setString(2, employee.getEname());
				pstmt.setInt(3, employee.getEage());
				pstmt.setString(4, employee.getEmail());
				pstmt.setString(5, employee.getMobile());

				int rowCount = pstmt.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				} else {
					status = "failure";
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

}
