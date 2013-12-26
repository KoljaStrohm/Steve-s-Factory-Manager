package vswe.stevesfactory.components;


import java.util.List;

public class ComponentMenuItemCondition extends ComponentMenuItem implements IConditionStuffMenu {
    public ComponentMenuItemCondition(FlowComponent parent) {
        super(parent);
    }


    @Override
    protected void initRadioButtons() {
        radioButtons.add(new RadioButton(RADIO_BUTTON_X_LEFT, RADIO_BUTTON_Y, "Requires all"));
        radioButtons.add(new RadioButton(RADIO_BUTTON_X_RIGHT, RADIO_BUTTON_Y, "If any"));
    }

    public boolean requiresAll() {
        return isFirstRadioButtonSelected();
    }

    @Override
    public void addErrors(List<String> errors) {
        for (Setting setting : getSettings()) {
            if (setting.isValid()) {
                return;
            }
        }

        errors.add("No condition selected");
    }
}