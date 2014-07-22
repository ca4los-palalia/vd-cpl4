package com.cplsys.aisa.domain.ui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.cplsys.aisa.domain.CaidaVoltaje;
import com.cplsys.aisa.domain.CircuitLenght;
import com.cplsys.aisa.domain.ConductorSize;
import com.cplsys.aisa.domain.ConductorType;
import com.cplsys.aisa.domain.ConduitType;
import com.cplsys.aisa.domain.SystemType;

public class VoltageTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 55802668587906601L;

	private static String[] COLUMN_NAMES;

	private List<CaidaVoltaje> informacionRowList;

	
	public VoltageTableModel(List<CaidaVoltaje> entradaDatos, String[] columns){
		informacionRowList = entradaDatos;
		COLUMN_NAMES = columns;
	}
	
	
	public void agregarInformacionRow(CaidaVoltaje informacionRow) {
		informacionRowList.add(informacionRow);
		fireTableDataChanged();
	}

	public void eliminarInformacionRow(int rowIndex) {
		informacionRowList.remove(rowIndex);
		fireTableDataChanged();
	}

	public void limpiarInformacionRow() {
		informacionRowList.clear();
		fireTableDataChanged();
	}

	@Override
	public int getColumnCount() {
		return COLUMN_NAMES.length;
	}

	@Override
	public int getRowCount() {
		return informacionRowList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return informacionRowList.get(rowIndex).getConduitType();
		case 1:
			return informacionRowList.get(rowIndex).getConductorType();
		case 2:
			return informacionRowList.get(rowIndex).getSystemType();
		case 3:
			return informacionRowList.get(rowIndex).getConductorSize();
		case 4:
			return informacionRowList.get(rowIndex).getCircuitLenght();
		case 5:
			return informacionRowList.get(rowIndex).getCurrentAmper();
		case 6:
			return informacionRowList.get(rowIndex).getVoltage();
		case 7:
			return informacionRowList.get(rowIndex).getPowerFactor();
		case 8:
			return informacionRowList.get(rowIndex).getZe();
		case 9:
			return informacionRowList.get(rowIndex).getVoltageDropVolts();
		case 10:
			return informacionRowList.get(rowIndex).getVoltageDropPercentage();
		case 11:
			return informacionRowList.get(rowIndex).getFinalVoltage();
		case 12:
			return informacionRowList.get(rowIndex).getBotonCalcular();
		default:
			return null;
		}
	}

	@Override
	public String getColumnName(int columnIndex) {
		return COLUMN_NAMES[columnIndex];
	}

	@Override
	public Class getColumnClass(int column) {
		return String.class;	
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		CaidaVoltaje InformacionRow = informacionRowList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			InformacionRow.setConduitType((ConduitType) value);
			break;
		case 1:
			InformacionRow.setConductorType((ConductorType) value);
			break;
		case 2:
			InformacionRow.setSystemType((SystemType) value);
			break;
		case 3:
			InformacionRow.setConductorSize((ConductorSize) value);
			break;
		case 4:
			InformacionRow.setCircuitLenght((CircuitLenght) value);
			break;
		case 5:
			InformacionRow.setCurrentAmper((Float) value);
			break;
		case 6:
			InformacionRow.setVoltage((Integer) value);
			break;
		case 7:
			InformacionRow.setPowerFactor((Float) value);
			break;
		case 8:
			InformacionRow.setZe((Float) value);
			break;
		case 9:
			InformacionRow.setVoltageDropVolts((Float) value);
			break;
		case 10:
			InformacionRow.setVoltageDropPercentage((Float) value);
			break;
		case 11:
			InformacionRow.setFinalVoltage((Float) value);
		case 12:
			InformacionRow.setBotonCalcular((String) value);
			break;
		}
		fireTableCellUpdated(rowIndex, columnIndex);
	}

}
