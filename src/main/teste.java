/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import br.com.gamestore.DAO.ClientsDAO;
import br.com.gamestore.model.Clients;
import java.util.List;
/**
 *
 * @author d4rkp
 */
public class teste {
    public static void teste(String[] args) {
        ClientsDAO dao = new ClientsDAO();
        
        Clients inserirCliente = new Clients(
                "Geraldo",
                "987987987",
                "11912312312",
                "Bananeira",
                "666",
                "Teste de Janeiro"
        );
        dao.Insert(inserirCliente);
       
        
        /* TESTE DE DELETE
        Clients clienteParaExcluir = new Clients();
        clienteParaExcluir.setcustomerID(3);
        
        dao.Delete(clienteParaExcluir); */
        
        /* TESTE DE READ
        List<String> todosClientes = dao.listarTodos();
        System.out.println("ID | NOME | CPF | CONTATO | RUA | NUMERO | CIDADE | DATA DE REGISTRO");
        for (String cliente : todosClientes) {
            System.out.println(cliente);
        } */
       
        /* TESTE DE UPDATE
        Clients atualizarCliente = new Clients(
            "TESTE UPDATE",
            "1231231231",
            "123123123",
            "RUARUARUA",
            "123",
            "SAO PAULO"
        );
        
        atualizarCliente.setcustomerID(4);
        dao.Update(atualizarCliente);
        System.out.println("Update executado!"); */
    }
}

