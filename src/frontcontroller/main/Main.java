package frontcontroller.main;

import frontcontroller.controller.FrontController;

public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.handleRequest("gasto", "500.00");
        frontController.handleRequest("recebimento", "1000.00");
        frontController.handleRequest("invalido", "200.00");
    }
}
