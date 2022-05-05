package VIEW;

import MODEL.Categoria;
import MODEL.Fornecedor;
import MODEL.Produto;

public class testeMain {

	public static void main(String[] args) {
		
	//Categoria e suas descrições
		Categoria c1 = new Categoria();
		c1.setNome("Bebida Alcoólica");
		Categoria c2 = new Categoria();
		c2.setNome("Bebida Energética");
		Categoria c3 = new Categoria();
		c3.setNome("Bebida Fria");
		Categoria c4 = new Categoria();
		c4.setNome("Bebida Quente");
		
	//Fornecedores e suas descrições
		Fornecedor f1 = new Fornecedor();
		f1.setNome("Bebidas SP");
		f1.setEndereco("Rua das Rosas 1234");
		Fornecedor f2 = new Fornecedor();
		f2.setNome("Estoque Bebidas");
		f2.setEndereco("Rua dos Girassóis 4321");
		Fornecedor f3 = new Fornecedor();
		f3.setNome("Bebidas Armazém");
		f3.setEndereco("Rua das Orquídeas 1324");
		
		System.out.println("||||||| GERENCIAMENTO DE ESTOQUE DE BEBIDAS |||||||");
		System.out.println();
		
	//Produtos e suas descrições
		Produto p1 = new Produto();
		p1.setNome("Cerveja");
		p1.setDescricao("Descrição de Cerveja");
		p1.setValor(8.00);
		p1.setCategoria(c1);
		p1.setFornecedor(f1);
		System.out.println(p1);

		Produto p2 = new Produto();
		p2.setNome("Cachaça");
		p2.setDescricao("Descrição de Cachaça");
		p2.setValor(15.00);
		p2.setCategoria(c1);
		p2.setFornecedor(f2);
		System.out.println(p2);
		
		Produto p3 = new Produto();
		p3.setNome("Água");
		p3.setDescricao("Descrição de Água");
		p3.setValor(4.00);
		p3.setCategoria(c3);
		p3.setFornecedor(f3);
		System.out.println(p3);
	}

}
