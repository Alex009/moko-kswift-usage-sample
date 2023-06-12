import SwiftUI
import MultiPlatformLibrary
import MultiPlatformLibrarySwift

struct ContentView: View {
	let greet = Greeting().greeting()

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

func processState(_ state: UIStateKs<NSString>) {
    switch(state) {
    case .data(let obj):
        print((obj.value as String?) ?? "nil")
    case .empty:
        print("empty")
    case .error(let obj):
        print(obj.throwable)
    case .loading:
        print("loading")
    }
}
