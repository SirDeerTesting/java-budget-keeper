package databasefunctions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import net.proteanit.sql.DbUtils;

public class TablePopulate {
	
	public static ResultSet select(JTable table) {
		ResultSet rs = null;
		Connection conn = DbConnection.connect();
		
		try {
			String sql = "SELECT `oid` AS `Nr`,"
						+ " `date` AS `Kiedy`,"
						+ " `ifCyclic` AS `Cyk.`,"
						+ " `howMuch` AS `Ile`,"
						+ " `where` AS `Gdzie`"
						+ " FROM history";
			PreparedStatement ps=conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			TableRowSorter<TableModel> myTableRowSorter = new TableRowSorter<TableModel>((TableModel) table.getModel());
			table.setRowSorter(myTableRowSorter);
			
			table.getColumnModel().getColumn(0).setPreferredWidth(28);
			table.getColumnModel().getColumn(1).setPreferredWidth(79);
			table.getColumnModel().getColumn(2).setPreferredWidth(79);
			table.getColumnModel().getColumn(3).setPreferredWidth(79);
			table.getColumnModel().getColumn(4).setPreferredWidth(460);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		return rs;
	}
	
	public static void filter(String query, JTable table) {
		TableRowSorter<TableModel> myTableRowSorter = new TableRowSorter<TableModel>((TableModel) table.getModel());
		table.setRowSorter(myTableRowSorter);
		
		myTableRowSorter.setRowFilter(RowFilter.regexFilter(query));
	}
}
