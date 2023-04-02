use std::io::{BufWriter, stdin, stdout, Write};

fn main() {
    let mut writer = BufWriter::new(stdout().lock());
    let mut cnt: u32 = 1;
    
    loop {
        // Get each testcase
        let case_vec = read_line_to_vec();

        // Print answers and Exit()
        if case_vec[0] == 0 && case_vec[1] == 0 && case_vec[2] == 0 {
            writer.flush().unwrap();
            return;
        }

        let answer = solve(case_vec, cnt);
        writeln!(writer, "{}", answer).unwrap();
        cnt += 1
    }
}

fn solve(case_vec: Vec<u32>, cnt: u32) -> String {
    let v = case_vec;
    let l = v[0];
    let p = v[1];
    let v = v[2];

    let quotient = v / p;
    let reminder = v % p;
    let left_days = l.min(reminder);
    let max_days = quotient * l + left_days;
    
    let answer = format!("Case {}: {}", cnt, max_days);

    return answer;
}

fn read_line_to_vec() -> Vec<u32> {
    let mut input_line = String::new();
    stdin().read_line(&mut input_line).unwrap();

    let output_vec: Vec<u32> = input_line
        .trim()
        .split_whitespace()
        .map(|x| x.parse::<u32>().unwrap())
        .collect();

    return output_vec;
}