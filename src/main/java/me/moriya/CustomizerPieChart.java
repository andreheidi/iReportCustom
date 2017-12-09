package me.moriya;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;

/**
 * Classe criada para utilizar o parâmetro Customizer Class do iReport do componente Pie3D
 *
 */
public class CustomizerPieChart implements JRChartCustomizer {

	public void customize(JFreeChart chart, JRChart jasperChart) {
		PiePlot3D piePlot3D = (PiePlot3D) chart.getPlot();
		StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("{0} {2}");
		generator.getPercentFormat().setMaximumFractionDigits(2);
		piePlot3D.setLabelGenerator(generator);
	}

}
