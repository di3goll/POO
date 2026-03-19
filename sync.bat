@echo off
:loop
cls
echo ========================================
echo   Sincronizacion con GitHub...
echo ========================================
git add .
git commit -m "Auto-sync: %date% %time%"
git push origin main
echo.
echo Operacion terminada. Proxima actualizacion en 1 hora.
echo No cierres esta ventana si quieres que siga sincronizando.
timeout /t 3600
goto loop