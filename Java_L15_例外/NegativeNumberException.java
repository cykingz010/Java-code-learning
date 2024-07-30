/**
 * 負数に関する例外クラス
 * @see Exception
 */
// カスタム例外クラスを作成してください
public class NegativeNumberException extends Exception {
  /**
   * コンストラクタ
   * @see Exception#Exception(String)
   * @param message エラーメッセージ
   */
  public NegativeNumberException(String message) {
    super(message);
  }
}