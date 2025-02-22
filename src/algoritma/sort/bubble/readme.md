# Bubble Sort

## Pengertian
Bubble Sort adalah salah satu algoritma pengurutan sederhana yang bekerja dengan cara menukar elemen yang bersebelahan jika urutannya salah. Proses ini dilakukan secara berulang hingga seluruh elemen dalam array berada dalam urutan yang benar.

## Cara Kerja
1. Bandingkan elemen pertama dengan elemen kedua.
2. Jika elemen pertama lebih besar dari elemen kedua, tukar posisinya.
3. Lanjutkan ke pasangan elemen berikutnya dan ulangi proses hingga mencapai akhir array.
4. Setelah satu iterasi penuh, elemen terbesar akan berada di posisi terakhir.
5. Ulangi proses untuk sisa elemen hingga seluruh array terurut.

## Kompleksitas Waktu
- **Terburuk (Worst Case):** O(n²)
- **Terbaik (Best Case - sudah terurut):** O(n)
- **Rata-rata (Average Case):** O(n²)

## Implementasi di Java
```java
public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("before sort : "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("after sort : "+ Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    break;
                }
            }
        }
    }
}
```

## Kelebihan dan Kekurangan
### Kelebihan:
- Mudah diimplementasikan
- Cocok untuk data kecil dan hampir terurut

### Kekurangan:
- Tidak efisien untuk jumlah data yang besar
- Kompleksitas waktu yang tinggi dibanding algoritma lain seperti Quick Sort atau Merge Sort

## Kesimpulan
Bubble Sort cocok digunakan untuk dataset kecil atau sebagai algoritma pembelajaran. Namun, untuk data dalam skala besar, algoritma lain yang lebih efisien lebih disarankan.
