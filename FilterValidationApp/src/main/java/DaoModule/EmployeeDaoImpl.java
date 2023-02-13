package DaoModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DtoModule.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
    private static final String sqlInsertQuery="Insert into table employee1(eid,ename,eage,email,mobile) values(?,?,?,?,?)";
	@Override
	public String insert(Employee employee) {
		String status="";
		Connection connection=null;
		PreparedStatement pstmt=null;
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql///practise1","root","yashr8143");
			if(connection !=null)
				pstmt=connection.prepareStatement(sqlInsertQuery);
			
			if(pstmt !=null) {
				int rowCount = pstmt.executeUpdate();
				if(rowCount==1)
					status="success";
				else 
					status="failure";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

}
