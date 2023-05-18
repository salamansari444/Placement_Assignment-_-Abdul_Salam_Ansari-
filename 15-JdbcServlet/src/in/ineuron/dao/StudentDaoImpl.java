package in.ineuron.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.model.Student;
import in.ineuron.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet resultSet=null;
	
	@Override
	public String addData(Student student) {
		
		String sqlInsertQuery="insert into student(`sname`,`sage`,`saddress`)values(?,?,?)";
		try {
			con=JdbcUtil.getJdbcConnection();
			if(con!=null) {
				pstmt=con.prepareStatement(sqlInsertQuery);
			}
			if(pstmt!=null) {
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getSaddress());
				
				int rowAffected=pstmt.executeUpdate();
				if(rowAffected==1) {
				return "success";	
				}
				
			}
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}
		return "failure";
	}

}
