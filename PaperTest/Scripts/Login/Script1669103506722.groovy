import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://paper.id/webappv1/#/login')

WebUI.setText(findTestObject('Page_Log In  Masuk ke Akun Anda - Paper.id/input_Email atau No. Handphone_email'), 'kandidat@paper.id')

WebUI.click(findTestObject('Page_Log In  Masuk ke Akun Anda - Paper.id/button_Selanjutnya'))

WebUI.setEncryptedText(findTestObject('Page_Log In  Masuk ke Akun Anda - Paper.id/input_Kata Sandi_password'), '6ditGNdwUgAUDlVn/ygUPw==')

WebUI.click(findTestObject('Page_Log In  Masuk ke Akun Anda - Paper.id/button_Masuk'))

WebUI.click(findTestObject('Page_Paper - Invoicing, Inventory, Accounti_676720/a_Penjualan'))

WebUI.click(findTestObject('Page_Paper - Invoicing, Inventory, Accounti_676720/a_Invoice Penjualan'))

WebUI.click(findTestObject('Page_Invoice Penjualan/button_Buat Invoice Baru'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/input'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/input'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/div_No Terms of Payment Selected'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/div_Net 7 Days'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/div_No Data Selected'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/span_Genteng Merah Jaya'))

WebUI.setText(findTestObject('Page_Buat Invoice Penjualan/textarea_Tahan klik untuk geser_item_name'), 'Barang jadi')

WebUI.setText(findTestObject('Page_Buat Invoice Penjualan/textarea_Nama Produk_item_description'), 'siap pakai')

WebUI.setText(findTestObject('Page_Buat Invoice Penjualan/textarea_Deskripsi Produk_quantity'), '10')

WebUI.setText(findTestObject('Page_Buat Invoice Penjualan/textarea_Kuantitas_price'), '50,0000')

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/td_Biaya Kirim_text-right ng-tns-c680-28'))

WebUI.setText(findTestObject('Page_Buat Invoice Penjualan/input_Biaya Kirim_delivery_fee'), '100,000')

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/td_0.00'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/button_Simpan Invoice'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/a_Simpan dan Konfirmasi'))

WebUI.click(findTestObject('Page_Buat Invoice Penjualan/button_OKAY'))

WebUI.click(findTestObject('Page_INV2022TEST872984 -- Invoice Penjualan/div_MitraGenteng Merah Jaya Tanggal22-11-20_9ac520'))

WebUI.click(findTestObject('Page_INV2022TEST872984 -- Invoice Penjualan/a_Penjualan'))

WebUI.click(findTestObject('Page_INV2022TEST872984 -- Invoice Penjualan/span_Invoice Penjualan'))

WebUI.click(findTestObject('Page_Invoice Penjualan/div_Tindakan_p-checkbox-box'))

WebUI.click(findTestObject('Page_Invoice Penjualan/button_Pilih Tindakan'))

WebUI.click(findTestObject('Page_Invoice Penjualan/div_Invoice No.PelangganStatus Dokumen Clea_062b2f'))

WebUI.closeBrowser()

