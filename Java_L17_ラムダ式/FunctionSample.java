// 問題1. 関数型インターフェースを作成してください
/**
 * サンプルインターフェース
 */
@FunctionalInterface
public interface FunctionSample {
  /**
   * 計算処理を行います。
   * @param a 数値1
   * @param b 数値2
   * @return 計算結果
   */
  int calc(int a, int b);
}

