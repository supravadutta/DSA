import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            list.add(temp);
        }
        
        System.out.println(search(list));
    }

   public static List<String> search(List<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == 'a') {
                String temp = list.get(i);
                temp = temp.replaceAll("\\s+", "");
                temp = temp.replaceAll("\\W+", "");
                temp = temp.replaceAll("[0-9]", "");
                if (temp.length() == 3) {
                    result.add(list.get(i));
                }
            }
        }
        return result;
    }
}
