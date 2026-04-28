param(
    [string]$expectedFile = "expectedoutput.txt",
    [string]$outputFile = "output.txt"
)

if (-not (Test-Path $expectedFile)) {
    Write-Host "Error: Expected output file not found at $expectedFile. Please create it." -ForegroundColor Red
    exit 1
}

if (-not (Test-Path $outputFile)) {
    Write-Host "Error: Output file not found at $outputFile" -ForegroundColor Red
    exit 1
}

$expected = @(Get-Content $expectedFile | Where-Object { $_.Trim() -ne "" })
$actual = @(Get-Content $outputFile | Where-Object { $_.Trim() -ne "" })

$maxLen = [Math]::Max($expected.Count, $actual.Count)

$passed = 0
$failed = 0

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "          TEST CASE COMPARISON          " -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan

for ($i = 0; $i -lt $maxLen; $i++) {
    $exp = if ($i -lt $expected.Count) { $expected[$i].Trim() } else { "<EOF>" }
    $act = if ($i -lt $actual.Count) { $actual[$i].Trim() } else { "<EOF>" }

    if ($exp -eq $act) {
        $passed++
    } else {
        $failed++
        Write-Host "Test Case / Line $($i + 1) FAILED:" -ForegroundColor Red
        Write-Host "  Expected: $exp" -ForegroundColor Green
        Write-Host "  Actual  : $act" -ForegroundColor Yellow
        Write-Host "----------------------------------------"
    }
}

Write-Host "Total Cases:  $maxLen"
Write-Host "Passed:       $passed" -ForegroundColor Green
if ($failed -gt 0) {
    Write-Host "Failed:       $failed" -ForegroundColor Red
    Write-Host "SOME TESTS FAILED! X" -ForegroundColor Red
} else {
    Write-Host "Failed:       $failed" -ForegroundColor Green
    Write-Host "ALL TESTS PASSED! O" -ForegroundColor Green
}
