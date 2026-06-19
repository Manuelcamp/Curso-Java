package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ImportedProduct;
import entidades.Product;
import entidades.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> produtos = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			char tipoProduto = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Price: ");
			Double preçoProduto = sc.nextDouble();
			
			if(tipoProduto == 'c' || tipoProduto == 'C') {
				Product produto = new Product(nomeProduto, preçoProduto);
				produtos.add(produto);
			}
			else if(tipoProduto == 'i' || tipoProduto == 'I') {
				System.out.print("Customs free:");
				Double customProduto = sc.nextDouble();
				ImportedProduct importado = 
				new ImportedProduct(nomeProduto, preçoProduto, customProduto);
				produtos.add(importado);
			}
			else if(tipoProduto == 'u' || tipoProduto == 'U') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manuDate = LocalDate.parse(sc.next(), 
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				UsedProduct usado = new UsedProduct(nomeProduto, preçoProduto, manuDate);
				produtos.add(usado);
			}
			
		}
		System.out.println("\nPRICE TAGS:");
		for(Product verificador : produtos) {
			System.out.println(verificador.priceTag());
		}
		sc.close();
	}

}
