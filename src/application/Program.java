package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//Abrindo conexão com banco de dados:
		
		Connection conn = DB.getConnection();
		DB.CloseConnection();
	}

}
