package com.divs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.divs.bo.CustomerBo;
import com.mysql.cj.xdevapi.PreparableStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="dao")
public class CustomerDaoImpl implements ICustomerDao {
	
	@Autowired
	private DataSource dataSource;
	
	private static String INSERT_QUERY="insert into customer(`cname`,`caddress`,`pamt`,`rate`,`time`,`intrAmount`)values(?,?,?,?,?,?)";
	
	
	static {
		System.out.println("CustomerDaoImpl is loading...");
	}
	
	public CustomerDaoImpl() {
		System.out.println("CustomerDaoImpl 0 param is called");
	}

	

	
	
	@Override
	public String toString() {
		return "CustomerDaoImpl [dataSource=" + dataSource + "]";
	}

	@Override
	public int save(CustomerBo bo) throws Exception {
		Connection con=dataSource.getConnection();
		int count=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(INSERT_QUERY);
			pstmt.setString(1, bo.getCusName());
			pstmt.setString(2, bo.getCusAddr());
			pstmt.setFloat(3, bo.getpAmt());
			pstmt.setFloat(4, bo.getRate());
			pstmt.setFloat(5, bo.getTime());
			pstmt.setFloat(6, bo.getIntrAmount());
			
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		}
		
		return count;
	}

}
