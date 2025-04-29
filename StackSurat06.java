public class StackSurat06 {
        Surat06[] stack;
        int top;
        int size;

        public StackSurat06(int size) {
            this.size = size;
            stack = new Surat06[size];
            top = -1;
        }

        public boolean isFull() {
            return top == size - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(Surat06 s) {
            if (!isFull()) {
                top++;
                stack[top] = s;
                System.out.println("Surat berhasil ditambahkan.");
            } else {
                System.out.println("Stack penuh. Tidak dapat menambahkan surat.");
            }
        }

        public Surat06 pop() {
            if (!isEmpty()) {
                return stack[top--];
            } else {
                System.out.println("Stack kosong.");
                return null;
            }
        }

        public Surat06 peek() {
            if (!isEmpty()) {
                return stack[top];
            } else {
                System.out.println("Stack kosong.");
                return null;
            }
        }

        public void cariSurat(String namaMahasiswa) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                    System.out.println("Surat ditemukan untuk " + namaMahasiswa + ": " + stack[i].idSurat);
                    return;
                }
            }
            System.out.println("Tidak ditemukan surat untuk " + namaMahasiswa);
        }
}

