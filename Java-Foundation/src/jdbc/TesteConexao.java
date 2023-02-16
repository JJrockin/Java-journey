package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
//		String url = "jdbc:mysql://localhost:3306";
		// usa um conex�o segura sem verificar o certificado do servidor
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String password = "84934221";
		
		Connection conexao = DriverManager.getConnection(url, usuario, password);
		
		System.out.println("Conex�o efetuada com sucesso!");
		
		conexao.close();
	}

}
