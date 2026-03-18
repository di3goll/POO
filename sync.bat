:loop
git add .
git commit -m "Auto-sync"
git push origin main
timeout /t 600
goto loop