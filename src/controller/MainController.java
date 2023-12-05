package controller;
import i18n.Translations;
import context.Login;
import context.RegisterForm;
import context.RegisterPro;
import data.ProductManager;
import data.UserManager;
import data.ProductManager;
import data.models.Product;
import data.models.User;
import context.DashBoard;
import context.Window_two;
import java.lang.Object;

import config.Environments;
// this is the main controller of all flow of the application
public class MainController {
    UserManager userManager = new UserManager(Environments.pathFile);
    ProductManager productManager = new ProductManager(Environments.pathFile_two);
    Translations translations;
    Login login;
    Window_two window_two;
    DashBoard dashBoard;
    RegisterForm   registerForm;
    RegisterPro   registerPro;
    public MainController() {
        System.out.println("MainController");
        translations = new Translations();
        login = new Login(translations, translations.getI18nText("title-text"));
        dashBoard = new DashBoard(translations, translations.getI18nText("DashBoard"));
        registerForm = new RegisterForm(translations, translations.getI18nText("title-text"));
        registerPro = new RegisterPro(translations, translations.getI18nText("title-text"));
        dashBoard.setData(userManager.getUsers());
        window_two = new Window_two(translations, translations.getI18nText("Window_two"));
        window_two.setData(productManager.getProducts());
        login.addEventListener((String actionEvent, Object data) -> {
            if (actionEvent.equals("click-login")) {
                login.hideWindow();
                dashBoard.showWindow();
            } else if (actionEvent.equals("click-pro")) {
                login.hideWindow();
                window_two.showWindow();
            }
        });
        dashBoard.addEventListener((String actionEvent, Object data) -> {
            if (actionEvent.equals("click-register")) {
                //dashBoard.hideWindow();
                registerForm.showWindow();
            } 
        });
         window_two.addEventListener((String actionEvent, Object data) -> {
            if (actionEvent.equals("click-register")) {
                //dashBoard.hideWindow();
                registerPro.showWindow();
            } 
        });
        registerForm.addEventListener((String actionEvent, Object data) -> {
            User user = (User) data;
            if (actionEvent.equals("click-register")) {
                userManager.saveUser(user);
                dashBoard.refresh(user);
            }
        });
           registerPro.addEventListener((String actionEvent, Object data) -> {
            Product product = (Product) data;
            if (actionEvent.equals("click-register")) {
                productManager.saveProduct(product);
                window_two.refresh_two(product);
            }
        });
        login.showWindow();
    }
}
