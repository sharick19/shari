package i18n;

import java.util.HashMap;

import org.w3c.dom.Text;

import config.Environments;

public class Translations {

    public HashMap<String, HashMap<String, String>> language = new HashMap(); 
    public Translations() {
        HashMap<String, String> en = new HashMap<>();
        en.put(TextCodes.titleText, "Main windows");
        en.put(TextCodes.userNameTextField, "User name");
        en.put(TextCodes.promptText, "We helped in all");
        en.put(TextCodes.registerText, "Registrar la informacion del personal");
        en.put(TextCodes.notificationText, "do you want to receive notifications");
        en.put(TextCodes.lastNameTextField, "Last name");
        en.put(TextCodes.adminText, "Admin");
        en.put(TextCodes.clientText, "Client");
        en.put(TextCodes.cashierText, "Cashier");
        en.put(TextCodes.enterText, "Login");
        en.put(TextCodes.ButtonTextPro, "Product"); 
        en.put(TextCodes.emailTextField, "Email");
        en.put(TextCodes.phone, "Phone");
        en.put(TextCodes.registerUserNav, "Register User");
        en.put(TextCodes.registerUserMainNav, "Main List");

        en.put(TextCodes.productNameTextField, "Product");
         en.put(TextCodes.descriptionTextField, "Description");
         en.put(TextCodes.Type, "Type");
        en.put(TextCodes.Price, "Price");


        HashMap<String, String> es = new HashMap<>();
        es.put(TextCodes.titleText, "Ventana principal");
        es.put(TextCodes.userNameTextField, "Nombre de Usuario");
        es.put(TextCodes.promptText, "Te ayudamos en todo");
        es.put(TextCodes.registerText, "Registra tus datos");
        es.put(TextCodes.notificationText, "quieres recibir notificaciones");
        es.put(TextCodes.lastNameTextField, "Apellido");
        es.put(TextCodes.productNameTextField, "Producto");
         es.put(TextCodes.descriptionTextField, "Descripcion");
         es.put(TextCodes.Type, "Tipo");
        es.put(TextCodes.Price, "Precio");
        
        es.put(TextCodes.adminText, "Administrador");
        es.put(TextCodes.clientText, "Cliente");
        es.put(TextCodes.cashierText, "Cajero");
        es.put(TextCodes.enterText, "Entrar");
        es.put(TextCodes.ButtonTextPro, "Producto"); 
        es.put(TextCodes.emailTextField, "Correo electronico");
        es.put(TextCodes.phone, "Telefono");
        es.put(TextCodes.registerUserNav, "REGISTRAR USUARIO");
        es.put(TextCodes.registerProductNav, "REGISTRAR PRODUCTO");
        es.put(TextCodes.registerUserMainNav, "LISTA PRINCIPAL");
        es.put(TextCodes.registerProductMainNav, "LISTA PRINCIPAL De Productos");
        
        language.put("en", en);
        language.put("es", es);
    }
    public String getI18nText(String key) {
        return language.get(Environments.lag).get(key);
    }
}
