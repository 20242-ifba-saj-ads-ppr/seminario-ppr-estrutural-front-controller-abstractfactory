package frontcontroller.controller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean autenticarUsuario() {
        System.out.println("Usuário autenticado com sucesso.");
        return true;
    }

    private void logRequisicao(String requestType) {
        System.out.println("Requisição recebida: " + requestType);
    }

    public void handleRequest(String requestType, String valor) {
        logRequisicao(requestType);
        if (autenticarUsuario()) {
            dispatcher.dispatch(requestType, valor);
        }
    }
}
