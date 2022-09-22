import cv2

orig_img = cv2.imread("C:\\Users\\HP\\Downloads\\bluemoon.jpg")
grey_img = cv2.cvtColor(orig_img, cv2.COLOR_BGR2GRAY)
cv2.imshow("color", orig_img)
cv2.imshow("grey", grey_img)
cv2.waitKey(0)
cv2.destroyAllWindows
import PIL
from PIL import Image
img = Image.open(r'grey.jpg')
img= img.save("arohi.jpg")

