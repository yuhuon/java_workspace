package com.sds.movie.list;

import javax.swing.table.AbstractTableModel;

public class MovieModel extends AbstractTableModel{
	String[] columnName={
			"movie_id",
			"��ȭ����",
			"genre_id",
			"������",
			"�󿵽ð�"
	};
	
	public int getColumnCount() {
		return columnName.length;
	}
	public String getColumnName(int col) {
		return columnName[col];
	}
	public int getRowCount(){
		return 0;
	}
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}
	 
	//��ȭ��� �������� 
	public void selectAll(){
		String sql="select m.genre_id, title, movie_id, openday,showtime from movie m, genre g";
		sql=sql+" where m.genre_id=g.genre_id";
	}
	
}











