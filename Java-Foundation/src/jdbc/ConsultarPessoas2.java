package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua pesquisa: ");
		String pesquisa = entrada.nextLine();

		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM pessoas where nome like ?";
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
//		Pesquisa sem %, sendo concatenado e amarrado um único tipo de pesquisa
		stmt.setString(1, "%" + pesquisa + "%");
//		Pesquisa com % na entrada possibilitando testar "termina com %xyz, contém %xyz% e começa com xyz%"
//		stmt.setString(1, pesquisa);
		ResultSet resultado = stmt.executeQuery();
		
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ===> " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}

}
