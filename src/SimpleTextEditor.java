
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<EditorOperations> operations = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++){
            int operationType = scanner.nextInt();
            if(operationType == 1){
                String s = scanner.next();
                builder.append(s);
                operations.push(new EditorOperations(operationType,s.length()));
            }else if (operationType == 2){
                int delete = scanner.nextInt();
                String last = builder.substring(builder.length() - delete);
                builder.delete(builder.length() - delete,builder.length());
                operations.push(new EditorOperations(operationType,last));
            }else if(operationType == 3){
                int k = scanner.nextInt();
                System.out.println(builder.charAt(k - 1));
            }else {
                EditorOperations editorOperation = operations.pop();
                if(editorOperation.type == 1){
                    builder.delete(builder.length() - (int) editorOperation.operation,builder.length());
                }else
                {
                    builder.append(editorOperation.operation);
                }
            }
        }

        scanner.close();
    }
}

class EditorOperations{
    int type;

    Object operation;
    public EditorOperations(int type, Object op){
        this.type = type;
        this.operation = op;
    }


}