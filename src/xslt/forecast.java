package xslt;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class forecast {
	public void writeFile(String filename,int lop) {
		try {
			FileWriter fw = null;
			File f = new File("D:/xml/fmwin/Month-ForecastMototal."+filename);
			fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("<Forcast>");
			for (int i = 0; i < lop; i++) {
				if (filename=="txt"){
				
					pw.print("P111-P111-P111-P111-P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("111111,");
					pw.print("P111-P111-P111-P111-P111,");
					pw.print("111111,");
					pw.print("201705,");
					pw.print("201705,");
					pw.print("111111,");
					pw.print("201705,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("PPPPPP,");
					pw.print("PPPPPP,");
					pw.print("PPPPPP,");
					pw.print("PPPPPP,");
					pw.print("PPPPPP,");
					pw.print("PPPPPP,");
					pw.print("PPPPPP,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("201705,");
					pw.print("201705,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("201705,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("201705,");
					pw.print("201705,");
					pw.print("201705,");
					pw.print("111111,");
					pw.print("201705,");
					pw.print("201705,");
					pw.print("PPPPPPPPPPPPPPPPPPPP,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("P111,");
					pw.print("P111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.print("P111,");
					pw.print("111111,");
					pw.print("111111,");
					pw.println("111111,");
				}
				else if(filename=="xml"){


            pw.println("<Item>");
            
            pw.println("<Node>P111-P111-P111-P111-P111</Node>");
            pw.println("<Fam>P111</Fam>");
            pw.println("<Geo>P111</Geo>");
            pw.println("<Dis>P111</Dis>");
            pw.println("<Dim4>P111</Dim4>");
            pw.println("<Dim5>P111</Dim5>");
            pw.println("<Model>111111</Model>");
            pw.println("<BasedOn>P111-P111-P111-P111-P111</BasedOn>");
            pw.println("<MaxPeriods>111111</MaxPeriods>");
            pw.println("<HistoStart>201705</HistoStart>");
            pw.println("<HistoEnd>201705</HistoEnd>");
            pw.println("<Horizon>111111</Horizon>");
            pw.println("<FcstEnd>201705</FcstEnd>");
            pw.println("<TrendType>111111</TrendType>");
            pw.println("<SmoothCoef>111111</SmoothCoef>");
            pw.println("<AutoAdaptation>111111</AutoAdaptation>");
            pw.println("<TradingDay>PPPPPP</TradingDay>");
            pw.println("<Target1>111111</Target1>");
            pw.println("<Target1Val>111111</Target1Val>");
            pw.println("<TargetProfile>111111</TargetProfile>");
            pw.println("<TargetStart>201705</TargetStart>");
            pw.println("<TargetEnd>201705</TargetEnd>");
            pw.println("<Target2>111111</Target2>");
            pw.println("<Target2Val>111111</Target2Val>");
            pw.println("<EECorrected>111111</EECorrected>");
            pw.println("<ForcedSplit>111111</ForcedSplit>");
            pw.println("<SeasonalityMode>111111</SeasonalityMode>");
            pw.println("<SeasonMonth1>111111</SeasonMonth1>");
            pw.println("<SeasonMonth2>111111</SeasonMonth2>");
            pw.println("<SeasonMonth3>111111</SeasonMonth3>");
            pw.println("<SeasonMonth4>111111</SeasonMonth4>");
            pw.println("<SeasonMonth5>111111</SeasonMonth5>");
            pw.println("<SeasonMonth6>111111</SeasonMonth6>");
            pw.println("<SeasonMonth7>111111</SeasonMonth7>");
            pw.println("<SeasonMonth8>111111</SeasonMonth8>");
            pw.println("<SeasonMonth9>111111</SeasonMonth9>");
            pw.println("<SeasonMonth10>111111</SeasonMonth10>");
            pw.println("<SeasonMonth11>111111</SeasonMonth11>");
            pw.println("<SeasonMonth12>111111</SeasonMonth12>");
            pw.println("<SeasonHistoEnd>201705</SeasonHistoEnd>");
            pw.println("<ResultSales12>111111</ResultSales12>");
            pw.println("<ResultFcst12>111111</ResultFcst12>");
            pw.println("<Fcst12Trgt>111111</Fcst12Trgt>");
            pw.println("<Result12>111111</Result12>");
            pw.println("<Result12Trgt>111111</Result12Trgt>");
            pw.println("<PrevYear>111111</PrevYear>");
            pw.println("<CurrentYear>111111</CurrentYear>");
            pw.println("<CurrentYearTarget>111111</CurrentYearTarget>");
            pw.println("<CurrPrev>111111</CurrPrev>");
            pw.println("<CurrPrevTrgt>111111</CurrPrevTrgt>");
            pw.println("<NextYear>111111</NextYear>");
            pw.println("<NexYearTrgt>111111</NexYearTrgt>");
            pw.println("<NextCurr>111111</NextCurr>");
            pw.println("<NextCurrTrgt>111111</NextCurrTrgt>");
            pw.println("<Sales>111111</Sales>");
            pw.println("<SalesRatio>111111</SalesRatio>");
            pw.println("<Rate4Target>111111</Rate4Target>");
            pw.println("<SalestoDo>111111</SalestoDo>");
            pw.println("<SalesToDoTrgt>111111</SalesToDoTrgt>");
            pw.println("<SalestoDoRatio>111111</SalestoDoRatio>");
            pw.println("<SalesToDoRatioTrgt>111111</SalesToDoRatioTrgt>");
            pw.println("<Platform>111111</Platform>");
            pw.println("<Trend>111111</Trend>");
            pw.println("<WarnSignal>111111</WarnSignal>");
            pw.println("<TrackSignal>111111</TrackSignal>");
            pw.println("<MeanAbs>111111</MeanAbs>");
            pw.println("<MADPlatform>111111</MADPlatform>");
            pw.println("<FsctError>111111</FsctError>");
            pw.println("<FcstError6>111111</FcstError6>");
            pw.println("<ModelBased>111111</ModelBased>");
            pw.println("<ModelLag>111111</ModelLag>");
            pw.println("<FcstStart>201705</FcstStart>");
            pw.println("<SeasonalityStart>201705</SeasonalityStart>");
            pw.println("<SeasonalityEnd>201705</SeasonalityEnd>");
            pw.println("<SmoothFilter>111111</SmoothFilter>");
            pw.println("<ContHistoStart>201705</ContHistoStart>");
            pw.println("<ContHistoEnd>201705</ContHistoEnd>");
            pw.println("<ExternalData>PPPPPPPPPPPPPPPPPPPP</ExternalData>");
            pw.println("<DisplayHorizon>111111</DisplayHorizon>");
            pw.println("<ShortFcstHorizon>111111</ShortFcstHorizon>");
            pw.println("<ShortFcstHisto>111111</ShortFcstHisto>");
            pw.println("<ShortFcstVal>111111</ShortFcstVal>");
            pw.println("<ShortFcstSeason>111111</ShortFcstSeason>");
            pw.println("<ManageExt>111111</ManageExt>");
            pw.println("<SeasonalityMax>111111</SeasonalityMax>");
            pw.println("<BestFit>111111</BestFit>");
            pw.println("<SmoothingCoef>111111</SmoothingCoef>");
            pw.println("<TrendWinters>111111</TrendWinters>");
            pw.println("<R2>111111</R2>");
            pw.println("<BestFitKey>P111</BestFitKey>");
            pw.println("<BestFitDesc>P111</BestFitDesc>");
            pw.println("<CV>111111</CV>");
            pw.println("<CVS>111111</CVS>");
            pw.println("<SalesPattern>P111</SalesPattern>");
            pw.println("<SalesPattTarget>111111</SalesPattTarget>");
            pw.println("<SalesPattVal>111111</SalesPattVal>");
            pw.println("<SalesPattHisto>111111</SalesPattHisto>");
            pw.println("<TradingDay1>PPPPPP</TradingDay1>");
			pw.println("<TradingDay2>PPPPPP</TradingDay2>");
			pw.println("<TradingDay3>PPPPPP</TradingDay3>");
			pw.println("<TradingDay4>PPPPPP</TradingDay4>");
			pw.println("<TradingDay5>PPPPPP</TradingDay5>");
			pw.println("<TradingDay6>PPPPPP</TradingDay6>");
            pw.println("</Item>");
				}
			}
			pw.println("</Forcast>");
			pw.flush();
			fw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		new forecast().writeFile("txt", 1000000);
		new forecast().writeFile("xml",1000000);


	}
}
