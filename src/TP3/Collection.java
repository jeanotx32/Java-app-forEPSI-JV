package TP3;
import java.util.*;

public class Collection{
private ArrayList<Series> listSeries;
	
	public Collection(){
	
	}

	public void addSerie(Series x) {
		ArrayList<Series> listSeries = new ArrayList<Series>();
		listSeries.add(x);
	
	}
	
	public void getSeries() {
		//this.listSeries;
	    for (int i = 0; i < listSeries.size(); i++) {
	        System.out.println(listSeries.get(i));
	    }
	}

}
