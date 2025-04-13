docker compose down --volumes --remove-orphans
sudo rm -rf data
mkdir data
cp server.jar data/
echo "eula=true" > data/eula.txt