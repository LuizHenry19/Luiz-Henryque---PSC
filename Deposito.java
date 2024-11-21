import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    
    public Deposito() {
        this.caixas = new ArrayList<>();
    }

    
    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    
    public boolean removerCaixa(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                caixas.remove(i);
                return true;
            }
        }
        return false; 
    }

    
    public int procurarCaixa(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                return i;
            }
        }
        return -1; 
    }

    
    public boolean mudarCaixa(String dono, String novoCorredor, int novaPosicao) {
        int index = procurarCaixa(dono);
        if (index != -1) {
            Caixa caixa = caixas.get(index);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
            return true;
        }
        return false; 
    }

    
    public ArrayList<Caixa> listarCaixasPesadas(double pesoMinimo) {
        ArrayList<Caixa> pesadas = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > pesoMinimo) {
                pesadas.add(caixa);
            }
        }
        return pesadas;
    }

    
    public Caixa getCaixa(int index) {
        if (index >= 0 && index < caixas.size()) {
            return caixas.get(index);
        }
        return null;
    }
}