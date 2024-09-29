package task3;

abstract  interface Sortable{ 
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){ 
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compare(a[j]) > 0) {
                    Sortable temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
   }
   