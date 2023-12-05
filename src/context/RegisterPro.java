package context;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.TextField;

import data.models.Product;
import i18n.TextCodes;
import i18n.Translations;
import ui.custom.BaseWindow;
import ui.custom.ButtonComponent;
import ui.custom.PanelBox;
import ui.custom.TextFieldComponent;

public class RegisterPro extends BaseWindow{
    private TextFieldComponent name_pro_Field;
    private TextFieldComponent Description_Field;
    private TextFieldComponent typeField;
    private  TextFieldComponent priceField;
    private ButtonComponent registerButton;
    private Translations lang;
    private PanelBox panel;
    public RegisterPro(Translations lang, String title) {
        super(title);
        this.lang = lang;
        this.setSize(new Dimension(350, 400));
        
        createForm();
    }
    public void createForm() {
        panel = new PanelBox();
        panel.setSize(new Dimension(350, 400));
        panel.roundedBorder(20);
        panel.setLayout(null);
        
        name_pro_Field = new TextFieldComponent(lang.getI18nText(TextCodes.productNameTextField), this.panel);
        name_pro_Field.setPosition(40);
       name_pro_Field.setSize(new Dimension(260, 40));
        name_pro_Field.setPlaceHolder(lang.getI18nText(TextCodes.productNameTextField));
        this.panel.add(name_pro_Field);

        Description_Field = new TextFieldComponent(lang.getI18nText(TextCodes.descriptionTextField), this.panel);
        Description_Field.setPosition(80);
        Description_Field.setSize(new Dimension(260, 40));
        Description_Field.setPlaceHolder(lang.getI18nText(TextCodes.descriptionTextField));
        this.panel.add(Description_Field);

        typeField = new TextFieldComponent(lang.getI18nText(TextCodes.Type), this.panel);
        typeField.setPosition(120);
        typeField.setSize(new Dimension(260, 40));
        typeField.setPlaceHolder(lang.getI18nText(TextCodes.Type));
        this.panel.add(typeField);

        priceField = new TextFieldComponent(lang.getI18nText(TextCodes.Price), this.panel);
        priceField.setPosition(160);
        priceField.setSize(new Dimension(260, 40));
        priceField.setPlaceHolder(lang.getI18nText(TextCodes.Price));
        this.panel.add(priceField);

        registerButton = new ButtonComponent(lang.getI18nText(TextCodes.registerText), this.panel);
        registerButton.setPosition(200);
        registerButton.setSize(new Dimension(260, 40));
        registerButton.addActionListener((event) -> {
            Product product = new Product(this.name_pro_Field.getText(), this.Description_Field.getText(), this.typeField.getText(), this.priceField.getText());
           this.getListener().onEvent("click-register", product); 
        });
        this.panel.add(registerButton);
        this.add(this.panel);
    }
}
