import java.time.LocalDate;
import java.util.*;

public class TodoList {

    // 複数のTodoを保持するフィールドを定義
    private List<TodoItem> items;
    
    // コンストラクタを定義
    public TodoList() {
      this.items = new ArrayList<>();
    }

    public void addItem(String title, LocalDate dueDate) {

        TodoItem item = new TodoItem(title, dueDate);
        // 問題1. Todoを追加するためのメソッドを定義
        items.add(item);
        System.out.println("新しいToDoアイテムが追加されました:" + title);
    }
    
    public void showItems() {
        System.out.println("Todoリスト:");
        // 全てのTodoを参照できるように、繰り返し条件を記述
        for (int i = 0; i < items.size(); i++) {
          TodoItem item = items.get(i);
          // Todoの情報を表示
          System.out.println((i + 1) + ". " + item.displayInfo());
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
          // Todoを1件削除する命令を記述
          TodoItem removedItem = items.remove(index);
            // 削除メッセージの出力命令を記述
            System.out.println("Todoアイテムが削除されました: " + removedItem.getTitle());
        } else {
          System.out.println("無効なインデックスです。");
        }
    }

    public void doneItem(int index) {
        if (index >= 0 && index < items.size()) {
          // Todoの情報を1件取得する命令を記述
          TodoItem item = items.get(index);
            // Todoを完了状態にする命令を記述
            item.setDone(true);
            System.out.println(item.getTitle() + " が完了しました。");
        } else {
          System.out.println("無効なインデックスです。");
        }
    }

}