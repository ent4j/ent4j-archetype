package ${package};

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

public class MyCreatePdf {

	public static void main(String[] args) {
		MyJasperGenerator gen = new MyJasperGenerator();

        //表示するデータを作る
        FamilyDTO dto = new FamilyDTO();

        //日本語を表示する場合は、別の設定が必要です。サンプルは英数字で確認してください。
        dto.setAddress("Tokyo HogeHoge PiyoPiyo");
        dto.setPhone("123-456-7890");

        //JRDataSourceに詰める
        JRDataSource dataSource = gen.makeBeansDataSource(dto);

        //１で作ったjrxmlファイルのパス
        String jrxmlFilePath = "src/main/resources/SampleReport.jrxml";

        //jrxmlからコンパイルするjasperファイルの出力先
        String jasperFilePath= "src/main/resources/SampleReport.jasper";

        //作成するpdfファイルの出力先
        String outputPdfPath= "a.pdf";

        Map<String,Object> params = new HashMap<>();//とりあえず今回は使いません。


        //作成実行
        gen.outputPdf(jrxmlFilePath, jasperFilePath, params, dataSource, outputPdfPath);
    
	}

}
