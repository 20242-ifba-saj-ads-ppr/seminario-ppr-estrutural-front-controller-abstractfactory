package frontcontroller.controller;

public class Dispatcher {
    private GastoController gastoController;
    private RecebimentoController recebimentoController;

    public Dispatcher() {
        this.gastoController = new GastoController();
        this.recebimentoController = new RecebimentoController();
    }

    public void dispatch(String requestType, String data) {
        switch (requestType.toLowerCase()) {
            case "gasto":
                gastoController.processarGasto(data);
                break;
            case "recebimento":
                recebimentoController.processarRecebimento(data);
                break;
            default:
                System.out.println("Requisição inválida!");
        }
    }
}
