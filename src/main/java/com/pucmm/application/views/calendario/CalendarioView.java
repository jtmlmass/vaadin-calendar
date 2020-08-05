package com.pucmm.application.views.calendario;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.pucmm.application.views.main.MainView;

@Route(value = "calendario", layout = MainView.class)
@PageTitle("Calendario")
@CssImport("styles/views/calendario/calendario-view.css")
public class CalendarioView extends Div {

    public CalendarioView() {
        setId("calendario-view");
        add(new Label("Content placeholder"));
    }

}
