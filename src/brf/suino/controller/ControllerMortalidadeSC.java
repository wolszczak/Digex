package brf.suino.controller;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.util.List;

import brf.peru.controller.ControllerEscolhaDigP;
import brf.suino.model.ModelSC;
import brf.suino.view.ViewMortalidadeSC;

public class ControllerMortalidadeSC extends KeyAdapter implements FocusListener, ItemListener{
	private ControllerSC c;
	private ViewMortalidadeSC view;
	
	public ControllerMortalidadeSC(ControllerSC controller) {
		this.c = controller;
	}

	
	public void openWindow() {
		view = new ViewMortalidadeSC();
		view.setTitle("DIGEX - Suínos Creche");
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}


	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}