/**
 * 問14-2 クラスAlphaをスーパークラスに持ち、<br>
 * インターフェースBetaとGammaを実装したpublic名なクラスを作成してください。
 */
//Betaインタフェース
interface Beta {
}

//Gammaインタフェース
interface Gamma {
}

public class Delta extends Alpha implements Beta, Gamma {
}
