package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoas {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o codigo do dado a atualizar: ");
		int codigo = entrada.nextInt();


		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine(); // usado para não executar
			// automatico o recebimento do input antes que ele 
			// seja inserido
			
			System.out.print("\nDigite o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			stmt.close();
			
			System.out.println("\nNome atualizado!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		conexao.close();
		entrada.close();
	}

}
