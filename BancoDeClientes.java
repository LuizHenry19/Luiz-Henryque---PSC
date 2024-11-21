import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes;

    
    public BancoDeClientes() {
        clientes = new ArrayList<>();
    }

    
    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    
    public boolean removerCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
                return true; 
            }
        }
        return false; 
    }

    
    public boolean alterarCliente(int id, String novoNome, String novoFone) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(novoNome);
                cliente.setFone(novoFone);
                return true; 
            }
        }
        return false; 
    }

    
    public Cliente listarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente; 
            }
        }
        return null; 
    }

    
    public void listarTodosClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}