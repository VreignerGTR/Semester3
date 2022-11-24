#Bryan Johnson
#20210801200
#Teknik Informatika

print ("=======================================")
nama_mhs = str(input("Masukan Nama = "))
nim_mhs = str(input("Masukan NIM = "))
print ("=======================================")

menu = "y" or "Y"
while menu == "y" or "Y":
    print(" ========================================")
    print(" Selamat Datang di Van Johnson's Warteg")
    print(" List Menu Restoran")
 
    print(" ========================================")
    print(" 1. Capucinno : Rp 5.500")
    print(" 2. Teh : Rp 4.500")
    print(" 3. Exit = Masukan Harga 0 agar langsung exit ")
    print(" ========================================")
    listMenu=str(input(" Masukkan Pilihan = "))
    masukanHarga=int(input(" Masukan Harga ="))
    if listMenu == "1":
        namaMenu= " Capucinno"
        harga=(5500)
        ppn= int(harga * 0.1)
        if masukanHarga <= 5500:
            print (" Jumlah yang harus dibayarkan 5.500 ")
            totalHarga=int(harga+ppn)
        else:
            totalHarga=int(harga+ppn)
    elif listMenu == "2":
        namaMenu= " Teh"
        harga = (4500)
        ppn = int(harga * 0.1)
        if masukanHarga <= 4500:
                print (" Jumlah yang harus dibayarkan 4.500 ")
                totalHarga =int(harga+ppn)
        else:
            totalHarga =int(harga+ppn)
    elif listMenu == "3":
     menu=exit()
    print(" ============================= ")
    print(" Menu :",namaMenu)
    print(" Harga :", harga)
    print(" Pajak :", ppn)
    print(" ============================= ")
    print(" Total Pembayaran :", totalHarga)
    print(" Jumlah :", masukanHarga)
    print(" ============================= ")
    menu=input(" kalo mo pesen lagi tinggal pencet Y kalo engga ya N (Y/N) = ")