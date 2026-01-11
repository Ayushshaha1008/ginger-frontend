## Deploy Frontend (open new tab)
```shell
cd Flight-reservation
cd frontend
apt install nodejs npm -y
export VITE_API_URL=http://localhost:8080
npm install
npm run build
apt install apache2 -y
cp dist/* /var/www/html/
systemctl start apache2
```