package com.example.generator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {
	String prefix = "newonecreator";
	String suffix = "";

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
		try {
			Connection connection = jdbcConnectionAccess.obtainConnection();
			Statement statement = connection.createStatement();
			String seqQuery = "SELECT order_id_seq1.NEXTVAL FROM dual";
			ResultSet resultSet = statement.executeQuery(seqQuery);
			if (resultSet.next()) {
				int seqval = resultSet.getInt(1);
				suffix = String.valueOf(seqval);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix;
	}
}
