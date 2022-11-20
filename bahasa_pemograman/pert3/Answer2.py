#Bryan Johnson
#20210801200
#Teknik Informatika

from ast import Return


print("\nMenentukan pilihan dengan memasukkan nomor")
print(50*"=")
print("""
1. Penjumlahan
2. Pengurangan
3. Perkalian
4. Pembagian
""")


pil = int(input("Pilih nomor ke?> "))
if pil == 1:
    # Penjumlahan
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a + b
    print("Hasil penjumlahan bilangan pertama & kedua:> ", c)
elif pil == 2:
    # Pengurangan
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a - b
    print("Hasil pengurangan bilangan pertama & kedua:> ", c)
elif pil == 3:
    # Perkalian
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a * b
    print("Hasil perkalian bilangan pertama & kedua:> ", c)
elif pil == 4:
    # Pembagian
    a = int(input('Bilangan Pertama> '))
    b = int(input("Bilangan Kedua> "))
    c = a / b
    print("Hasil pembagian bilangan pertama & kedua:> ", c)
elif pil == 5:
    print("gapaham dan ga ngerti, \nperbaiki ulang gih!")
