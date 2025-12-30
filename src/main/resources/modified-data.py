import json

INPUT_FILE = "./response.json"
OUTPUT_FILE = "response-new.json"

with open(INPUT_FILE, "r", encoding="utf-8") as f:
    data = json.load(f)

records = data.get("data", [])

for idx, item in enumerate(records):
    item["TimeInSecond"] = idx
    item["Seconds"] = idx

with open(OUTPUT_FILE, "w", encoding="utf-8") as f:
    json.dump(data, f, ensure_ascii=False, indent=2)

print(f"Completed. Updated {len(records)} records.")
print(f"Output file: {OUTPUT_FILE}")