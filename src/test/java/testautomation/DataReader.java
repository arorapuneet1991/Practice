package testautomation;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataReader {
    public Object[][] data(String sheet) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/src/test/java/testautomation/Sheet.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheet);

        int rowCount = xssfSheet.getLastRowNum();
        Object[][] x = new Object[rowCount][1];

        for (int rows = 0; rows < rowCount; rows++) {
            Map<String, String> mymap = new HashMap<>();

            for (int cell = 0; cell < xssfSheet.getRow(rows).getLastCellNum(); cell++) {
                mymap.put(xssfSheet.getRow(0).getCell(cell).toString(), xssfSheet.getRow(rows).getCell(cell).toString());
            }
            x[rows][0] = mymap;
        }
        return x;
    }
}
